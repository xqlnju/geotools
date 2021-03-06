/**
 *
 * $Id$
 */
package net.opengis.ows10.validation;

import net.opengis.ows10.KeywordsType;
import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link net.opengis.ows10.DescriptionType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DescriptionTypeValidator {
  boolean validate();

  boolean validateTitle(String value);
  boolean validateAbstract(String value);
  boolean validateKeywords(EList value);
}
