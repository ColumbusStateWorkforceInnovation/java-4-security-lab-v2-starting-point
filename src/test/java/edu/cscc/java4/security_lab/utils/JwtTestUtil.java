package edu.cscc.java4.security_lab.utils;

/**
 * Utility class to create a JWT for testing purposes.
 * Example usage:
 * <pre>
 *  Ingredient ingredient = IngredientBuilder.anIngredient().withDefaults().build();
          mockMvc.perform(MockMvcRequestBuilders.post("/recipes/{recipeId}/ingredients", 999)
                  .with(JwtTestUtil.getJwt(Set.of("ingredients:read", "recipes:read")))
                          .contentType("application/json")
                          .content(objectMapper.writeValueAsString(ingredient)))
                  .andExpect(status().isNotFound());
 * </pre>
 */
public class JwtTestUtil {
//TODO: Uncomment when Spring Security Test dependency is added

//    public static SecurityMockMvcRequestPostProcessors.JwtRequestPostProcessor getJwt(Set<String> scopes) {
//        return SecurityMockMvcRequestPostProcessors.jwt().jwt((jwt) -> {
//            jwt.claims(claims -> {
//                claims.put("scope", String.join(" ", scopes));
//            });
//        });
//    }
}
