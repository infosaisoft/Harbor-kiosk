package security;

import org.springframework.stereotype.Component;

import com.harbor.domain.AdminBo;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtGenerator {
	private String secret = "hodor";
	
	public String generate(AdminBo user) {
		Claims claims =  Jwts.claims().setSubject(user.getUsername() );
		
		claims.put("userId", String.valueOf(user.getAdmin_id()) );
		claims.put("role", user.getRole());
		
		
		return Jwts.builder().setClaims(claims).signWith(SignatureAlgorithm.HS512, secret).compact();
	}

}
