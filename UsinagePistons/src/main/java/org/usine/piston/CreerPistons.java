package org.usine.piston;

import org.usine.usinage.Triage;
import org.usine.usinage.TypeOfUsinagePistons;
import org.usine.cartons.Carton;
import org.usine.machine.Machine;
import org.usine.machine.MachineAxe;
import org.usine.machine.MachineJupe;
import org.usine.machine.MachineTete;
import org.usine.piece.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class CreerPistons {
    
    private final Triage triage;
    private final Machine machineAxe;
    private final Machine machineTete;
    private final Machine machineJupe;
    private final PistonsChaine pistonChaine;
    private final PistonsParallele pistonsParallele;
    private boolean isChainage;
    public CreerPistons() {
        triage = new Triage();
        machineAxe = new MachineAxe();
        machineTete = new MachineTete();
        machineJupe = new MachineJupe();
        pistonChaine = new PistonsChaine();
        pistonsParallele = new PistonsParallele();
    }

    public List<Piston> getPistons(Carton carton, TypeOfUsinagePistons typeUsinage){
        this.isChainage = (typeUsinage == TypeOfUsinagePistons.EN_CHAINE);
        Map<KeyPiece, Collection<Piece>> dictionnairePiece = triage.tri(carton);

        List<Piece> pieceAxeList = new ArrayList<>(dictionnairePiece.get(KeyPiece.AXE));
        List<Piece> pieceTeteList = new ArrayList<>(dictionnairePiece.get(KeyPiece.TETE));
        List<Piece> piecesJupeList = new ArrayList<>(dictionnairePiece.get(KeyPiece.JUPE));


        int tailleLimite = this.taillePiecePlusPetit(pieceAxeList.size(), piecesJupeList.size(),
                pieceTeteList.size());

        List<Piston> pistons = new ArrayList<>();
        genererPiston(pieceAxeList, pieceTeteList, piecesJupeList, tailleLimite, pistons);

        return pistons;
    }

    private void genererPiston(List<Piece> pieceAxeList, List<Piece> pieceTeteList, List<Piece> piecesJupeList, int tailleLimite, List<Piston> pistons) {

        /*Ici, nous utilisons IntStream.range() pour générer une séquence d'entiers allant de 0
     à "tailleLimite", puis nous utilisons mapToObj() pour mapper chaque entier à une instance de la
     classe Piston créée à partir des pièces usinées correspondantes. Enfin, nous collectons
     les instances de Piston créées dans une liste en utilisant la méthode toList().
     */
        pistons.addAll(IntStream.range(0, tailleLimite)
                .mapToObj(i -> {
                    Piece axe = pieceAxeList.get(i);
                    this.machineAxe.usiner(axe);
                    Piece jupe = piecesJupeList.get(i);
                    this.machineJupe.usiner(jupe);
                    Piece tete = pieceTeteList.get(i);
                    this.machineTete.usiner(tete);
                    return Boolean.TRUE.equals(this.isChainage) ?
                            this.pistonChaine.monterPistonEnChaine((Axe) axe, (Jupe) jupe, (Tete) tete) :
                            this.pistonsParallele.monterPistonsEnParallele((Axe) axe, (Jupe) jupe, (Tete) tete);
                })
                .toList());
    }

    public int taillePiecePlusPetit(int taille1, int taille2, int taille3) {
        return Math.min(Math.min(taille1, taille2), taille3);
    }
}
