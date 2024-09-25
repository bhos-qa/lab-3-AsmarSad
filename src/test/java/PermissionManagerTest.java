import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PermissionManagerTest {

    @Test
    public void testGetRoleName() {
        PermissionManager pm = new PermissionManager();

        // Test for all enum values
        assertEquals("Admin", pm.getRoleName(PermissionLevel.ADMIN));
        assertEquals("Developer", pm.getRoleName(PermissionLevel.DEVELOPER));
        assertEquals("User", pm.getRoleName(PermissionLevel.USER));

        // Test for null case
        assertEquals("Unknown", pm.getRoleName(null));
    }

    @Test
    public void testSetPermissionLevel() {
        PermissionManager pm = new PermissionManager();

        // Set and test for ADMIN
        pm.setPermissionLevel(PermissionLevel.ADMIN);
        assertEquals(PermissionLevel.ADMIN, pm.getCurrentLevel());

        // Set and test for DEVELOPER
        pm.setPermissionLevel(PermissionLevel.DEVELOPER);
        assertEquals(PermissionLevel.DEVELOPER, pm.getCurrentLevel());

        // Set and test for USER
        pm.setPermissionLevel(PermissionLevel.USER);
        assertEquals(PermissionLevel.USER, pm.getCurrentLevel());
    }
}
