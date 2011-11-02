/**
 * Created 02.11.2011
 * This code is copyright (c) 2004 PAYONE Gmbh & Co. KG.
 */
package service

import org.apache.camel.Exchange
import org.apache.camel.Processor

/**
 * @author Guido Zockoll
 *
 */
class SomeService extends Processor {
    def process(exchange:Exchange) = {
      print("Hello!")
    }
}