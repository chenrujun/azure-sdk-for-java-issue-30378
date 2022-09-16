package chenrujun.azure.sdk.issue;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class DemoController {

    @GetMapping("/idToken")
    public String idToken(Principal principal) {
        OAuth2User user = ((OAuth2AuthenticationToken)principal).getPrincipal();
        return ((OidcUser)user).getIdToken().getTokenValue();
    }
}
