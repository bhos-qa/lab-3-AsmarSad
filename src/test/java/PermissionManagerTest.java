import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PermissionManagerTest {

    @Test
    public void testGetRoleName() {
        PermissionManager pm = new PermissionManager();

        assertEquals("Admin", pm.getRoleName(PermissionLevel.ADMIN));
        assertEquals("Developer", pm.getRoleName(PermissionLevel.DEVELOPER));
        assertEquals("User", pm.getRoleName(PermissionLevel.USER));
    }

    @Test
    public void testSetPermissionLevel() {
        PermissionManager pm = new PermissionManager();
        pm.setPermissionLevel(PermissionLevel.ADMIN);
        assertEquals(PermissionLevel.ADMIN, pm.getCurrentLevel());

        pm.setPermissionLevel(PermissionLevel.DEVELOPER);
        assertEquals(PermissionLevel.DEVELOPER, pm.getCurrentLevel());
    }
}
