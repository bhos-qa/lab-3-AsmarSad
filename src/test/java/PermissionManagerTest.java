import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PermissionManagerTest {

    PermissionManager pm;

    @BeforeEach
    public void setUp() {
        pm = new PermissionManager();
    }

    @Test
    public void testDefaultPermissionLevel() {
        // Test that the default level is USER
        assertEquals(PermissionLevel.USER, pm.getCurrentLevel());
    }

    @Test
    public void testGetRoleName() {
        // Test for all enum values
        assertEquals("Admin", pm.getRoleName(PermissionLevel.ADMIN));
        assertEquals("Developer", pm.getRoleName(PermissionLevel.DEVELOPER));
        assertEquals("User", pm.getRoleName(PermissionLevel.USER));

        // Test for null case
        assertEquals("Unknown", pm.getRoleName(null));

        // Test for unknown level (not really possible with enums but good practice)
        assertEquals("Unknown", pm.getRoleName(null)); // Already covered with null check
    }

    @Test
    public void testSetPermissionLevel() {
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

    @Test
    public void testSetPermissionLevelNull() {
        // Test setting null does not change the current level
        pm.setPermissionLevel(null);
        assertEquals(PermissionLevel.USER, pm.getCurrentLevel()); // Default should remain USER
    }
}
