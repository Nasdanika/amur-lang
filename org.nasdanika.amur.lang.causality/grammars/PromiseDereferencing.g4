
grammar PromiseDereferencing;

@header {
package org.nasdanika.amur.lang.causality.parse.promisedereferencing;
}

// Compact way : 
translationUnitCompact: (promise=code property* Dereference?)? tail=code? EOF;

property: PropertyDereference code;

// Longer way
translationUnit: (dereference | propertyDereference)? code? EOF;

dereference: (code | propertyDereference) Dereference; 
    
propertyDereference: code (PropertyDereference code)+;    

code: Code+;

//DereferenceEscape: '~\\~';

//PropertyDereferenceEscape: '~\\>';

Dereference: '~~';

PropertyDereference: '~>';

Code : .+?;

