public class PermissionManager {

    PermissionLevel mCurrentLevel = PermissionLevel.USER;

    public String getRoleName(PermissionLevel level) {
        switch (level) {
            case ADMIN:
                return "Admin";
            case DEVELOPER:
                return "Developer";
            case USER:
                return "User";
            default:
                return "Unknown";
        }
    }

    public void setPermissionLevel(PermissionLevel level) {
        this.mCurrentLevel = level;
    }
    public PermissionLevel getCurrentLevel(){
        return mCurrentLevel;
    }
}
