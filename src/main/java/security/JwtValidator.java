package security;

import org.springframework.stereotype.Component;

import com.harbor.domain.AdminBo;


import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

@Component
public class JwtValidator {

	private String secret = "hodor";

	public AdminBo validate(String token) {
		AdminBo user = null;
		
		try {
		
		Claims body = Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
		
		user = new AdminBo();
	
		user.setUsername(body.getSubject());
		user.setAdmin_id(Long.parseLong((String) body.get("userId")));

		user.setRole((String) body.get("role"));
		}catch(Exception e) {
			System.out.println(e);
			
		}
		return user;
	}

}
