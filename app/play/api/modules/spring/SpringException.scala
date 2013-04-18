package play.api.modules.spring

import play.api.PlayException

/**
 *
 * @author wsargent
 * @since 12/10/11
 */

class SpringException(title: String = null,
                      description: String = null,
                      cause: Throwable = null) extends PlayException(title, description, cause) {

}
