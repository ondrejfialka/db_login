import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

public class Example {

    public void example() {
        FacesContext context = FacesContext.getCurrentInstance();
        context.getExternalContext().getUserPrincipal().getName();

        context.getExternalContext().isUserInRole("ADMIN");

        HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
        session.invalidate();
    }

}
