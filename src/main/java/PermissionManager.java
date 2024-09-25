public class PermissionManager {

    PermissionLevel mCurrentLevel = PermissionLevel.USER;

    public String getRoleName(PermissionLevel level) {
        if (level == null) {
            return "Unknown"; // Explicitly handle null case
        }
        switch (level) {
            case ADMIN:
                return "Admin";
            case DEVELOPER:
                return "Developer";
            case USER:
                return "User";
            default:
                return "Unknown"; // Default case
        }
    }

    public void setPermissionLevel(PermissionLevel level) {
        if (level != null) { // Add null check to avoid setting null
            this.mCurrentLevel = level;
        }
    }

    public PermissionLevel getCurrentLevel() {
        return mCurrentLevel;
    }
}
