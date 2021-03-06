package org.robolectric.shadows;

import android.webkit.JsPromptResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.TestRunners;

import static org.junit.Assert.assertNotNull;

@RunWith(TestRunners.MultiApiWithDefaults.class)
public class ShadowJsPromptResultTest {

  @Test
  public void shouldConstruct() throws Exception {
    JsPromptResult result = ShadowJsPromptResult.newInstance();
    assertNotNull(result);
  }
}
