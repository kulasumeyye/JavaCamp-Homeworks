package eCommerceManagement.GoogleAuth.abstracts;

public interface GoogleAuthService <T> {
	void googleAuthLogin(T user);
	void googleAuthSignIn(T user);

}
