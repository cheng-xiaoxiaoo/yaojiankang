package util.antisamy;

import java.io.IOException;

import org.owasp.validator.html.Policy;
import org.owasp.validator.html.PolicyException;
import org.springframework.core.io.Resource;

public class AntisamyFactory {
	public static Policy getPolicyInstance(Resource path) throws PolicyException, IOException {
		return Policy.getInstance(path.getFile());
	}

}
