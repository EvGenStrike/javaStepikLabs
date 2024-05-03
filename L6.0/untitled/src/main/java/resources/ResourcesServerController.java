package resources;

/**
 * @author a.akbashev
 * @author v.chibrikov
 *         <p>
 *         Пример кода для курса на https://stepic.org/
 *         <p>
 *         Описание курса и лицензия: https://github.com/vitaly-chibrikov/stepic_java_webserver
 */
public class ResourcesServerController implements ResourcesServerControllerMBean {
    private final TestResource resourcesServer;

    public ResourcesServerController(TestResource resourcesServer) {
        this.resourcesServer = resourcesServer;
    }

    @Override
    public String getName() {
        return resourcesServer.getName();
    }

    @Override
    public int getAge() {
        return resourcesServer.getAge();
    }
}
