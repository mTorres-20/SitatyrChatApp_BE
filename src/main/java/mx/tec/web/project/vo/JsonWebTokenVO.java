/**
 * 
 */
package mx.tec.web.project.vo;

import java.io.Serializable;

/**
 * @author Usuario
 *
 */
public class JsonWebTokenVO implements Serializable {
	
	/** UID */
	private static final long serialVersionUID = -4683200481070740123L;

	/** JsonWebToken token */
	private final String token;

	/**
	 * All arguments constructor
	 * @param token
	 */
	public JsonWebTokenVO(String token) {
		this.token = token;
	}
	
	/**
	 * @return the token
	 */
	public String getToken() {
		return this.token;
	}
	
}
