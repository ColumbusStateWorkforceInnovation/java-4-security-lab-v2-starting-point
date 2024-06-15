package edu.cscc.java4.security_lab.services;

//import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Utility service for working with JWT tokens.
 * Example usage:
 * <pre>
 *     if (tokenService.hasScope(jwt, "read:messages")) {
 *     // Do something
 *     }
 *     if (tokenService.hasScopes(jwt, "read:messages write:messages")) {
 *     // Do something
 *     }
 *     String userId = tokenService.getClaim(jwt, "sub");
 * </pre>
 * Alternate usage with Spring Security:
 * <pre>
 * @Autowired
 * private TokenService tokenService;
 *
 * @GetMapping("")
 * @PreAuthorize("@tokenService.hasScopes(#jwt, 'ingredients:read')")
 * public ResponseEntity<?> index(@PathVariable Integer recipeId, @AuthenticationPrincipal Jwt jwt) {
 * // Do something
 * }
 * </pre>
 */
@Service
public class TokenService {
// TODO Uncomment this code once the spring security dependency is added
//
//    public boolean hasScope(Jwt jwt, String scope) {
//        String[] scopes = jwt.getClaimAsString("scope").split(" ");
//        List<String> scopeList = List.of(scopes);
//        return scopeList.contains(scope);
//    }
//
//    public boolean hasScopes(Jwt jwt, String scopes) {
//        Set<String> jwtScopes = Set.of(jwt.getClaimAsString("scope").split(" "));
//        Set<String> scopeList = Set.of(scopes.split(" "));
//        return jwtScopes.containsAll(scopeList);
//    }
//
//    public String getClaim(Jwt jwt, String claim) {
//        return jwt.getClaim(claim);
//    }
}
