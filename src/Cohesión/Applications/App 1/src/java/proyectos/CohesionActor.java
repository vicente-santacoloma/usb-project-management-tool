package proyectos;

import javax.servlet.http.HttpServletRequest;

public class CohesionActor {

    public static final int NO_ACTOR = 0;
    public static final int ACTOR_actor1 = 1;
    public static final int ACTOR_actor2 = 2;
    public static final int ACTOR_administrador = 4;
    public static final int ACTOR_lider_de_metodologia = 8;
    public static final int ACTOR_lider_de_proyecto = 16;
    public static final int ACTOR_participante = 32;
    public static final int ACTOR_usuario = 64;
    public static final int ACTOR_visitante = 128;


    public static final String SALIDA_ACTOR = "A_InicioSistema";
    public static final String SESSION_ATTRIBUTE = "actor";

    /**
     * Constructor for CohesionActor
     * @param actorCode Code for this actor.
     */
    public CohesionActor(int actorCode) {
        this(actorCode, null);
    }

    /**
     * Constructor for CohesionActor
     * @param actorCode Code for this actor.
     * @param value A value related to de actor's rights.
     */
    public CohesionActor(int actorCode, Object value) {
        this.actorCode = actorCode;
        this.value = value;
    }

    /**
     * Static method to check for actor permissions.
     * @param request Request information.
     * @param options Different options of sctor parameters.
     * @return true if the actor has enough rights.
     *
     */
    public static boolean checkActor(HttpServletRequest request, int options) {
        Object actor = request.getSession().getAttribute(SESSION_ATTRIBUTE);
        if (actor != null && actor instanceof CohesionActor) {
            return ((CohesionActor) actor).hasRights(options);
        } else {
            return false;
        }
    }

    /**
     * Static method to check for actor permissions.
     * @param request Request information.
     * @param options Different options of sctor parameters.
     * @param value A value related to de actor's rights.
     * @return true if the actor has enough rights to handle value.
     */
    public static boolean checkActor(HttpServletRequest request, int options, Object value) {
        Object actor = request.getSession().getAttribute(SESSION_ATTRIBUTE);
        if (actor != null && actor instanceof CohesionActor) {
            return ((CohesionActor) actor).hasRights(options, value);
        } else {
            return false;
        }
    }

    /**
     * Check if this actor has rights.
     * @param options Valid actors in this situation.
     * @return true when the actor has enough rights.
     */
    public boolean hasRights(int options) {
        return (actorCode & options) > 0;
    }

    /**
     * Check if this actor has rights.
     * @param options Valid actors in this situation.
     * @param value A value related to de actor's rights.
     * @return true when the actor has enough rights.
     *
     */
    public boolean hasRights(int options, Object value) {
        return (actorCode & options) > 0 && this.value.equals(value);
    }

    /***
     * Check if an actor has rights.
     * @param actor Actual actor
     * @param options Valid actors in this situation.
     * @return true when the actor has enough rights.
     */
    public static boolean hasRights(CohesionActor actor, int options) {
        return (actor.getActorCode() & options) > 0;
    }

    /**
     * Check if an actor has rights.
     * @param actor Actual actor
     * @param options Valid actors in this situation.
     * @param value A value related to de actor's rights.
     * @return true when the actor has enough rights.
     */
    public static boolean hasRights(CohesionActor actor, int options, Object value) {
        return ((actor.getActorCode() & options) > 0 && actor.getValue().equals(value));
    }

    /**
     * Static method to fix actor permissions.
     * @param request Request information.
     * @param actor New actor.
     *
     */
    public static void setActor(HttpServletRequest request, CohesionActor actor) {
        actor.setMe(request);
    }

    /**
     * Fix me as the actor in this situation.
     * @param request Request information.
     *
     */
    public void setMe(HttpServletRequest request) {
        request.getSession(true).setAttribute(SESSION_ATTRIBUTE, this);
    }

    /**
     * Actor code for this actor
     */
    protected final int actorCode;

    /**
     * Get the value of actorCode
     *
     * @return the value of actorCode
     */
    public int getActorCode() {
        return actorCode;
    }

    /**
     *  Value A token an actor should have in order to validate his rights.
     */
    protected final Object value;

    /**
     * Get the value of value
     *
     * @return the value of value
     */
    public Object getValue() {
        return value;
    }

    /**
     * Actor's code as a String
     * @return String representation of an actor
     */
    public String toString() {
        return actorCode + "<" + value.toString() + ">";
    }

}