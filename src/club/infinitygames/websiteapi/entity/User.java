package club.infinitygames.websiteapi.entity;

public class User {
	private String username;
	private String displayname;
	private String uuid;
	private String group_id;
	private String registered;
	private boolean banned;
	private boolean validated;
	private String group_name;
	private boolean exists;
	private boolean error;
	
	public String getUsername() {
		return username;
	}
	public String getDisplayname() {
		return displayname;
	}
	public String getUuid() {
		return uuid;
	}
	public String getGroupId() {
		return group_id;
	}
	public String isRegistered() {
		return registered;
	}
	public boolean isBanned() {
		return banned;
	}
	public boolean isValidated() {
		return validated;
	}
	public String getGroupName() {
		return group_name;
	}
	public boolean exists() {
		return exists;
	}
	public boolean isError() {
		return error;
	}
}
