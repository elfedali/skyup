package ma.weboven.skyup.model;

/* Simple immutable , which returns a JSON with the project name and version.
 * @author weboven
 * @since 1.0-SNAPSHOT
 * @version 1.0-SNAPSHOT
 */
public class WhoAmIResponseModel {
    private final String name;
    private final String version;

    /*
     * Constructor of the class {@link WhoAmIResponseModel}
     * 
     * @param name the name of the project {@link String}
     * 
     * @param version the version of the project {@link String}
     */
    public WhoAmIResponseModel(final String name, final String version) {
        this.name = name;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

}
