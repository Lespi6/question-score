package deqo;

/**
 * Classe représentant une question à choix exclusive.
 */
public class QuestionAChoixExclusif implements QuestionAChoix {

    private String enonce;
    private int indiceBonneReponse;

    /**
     * Une question à choix excusive est complètement caractérisé par son énoncé
     * et l'indice de sa bonne réponse.
     * @param enoncequestion l'énoncé de la question
     * @param indiceBonneReponse l'indice de la bonne réponse
     */
    public QuestionAChoixExclusif(final String enoncequestion, final int indiceBonneReponse) {
        this.enonce = enoncequestion;
        this.indiceBonneReponse = indiceBonneReponse;
    }

    /**
     * Récupère l'énoncé de la question.
     * @return l'énoncé de la question
     */
    public final String getEnonce() {
        return enonce;
    }

    /**
     * Opération permettant de récupérer le score donné par un choix.
     * @param indiceChoix l'indice du choix
     * @return 100 si l'indice du choix fourni est l'indice de la bonne réponse,
     * 0 autrement
     */
    public final float getScoreForIndice(final int indiceChoix) {
        if (indiceChoix == indiceBonneReponse) {
            return 100;
        }
        return 0;
    }
}

