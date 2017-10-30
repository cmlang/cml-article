# CML - Conceptual Modeling Language

The first version of CML should provide the smallest, simplest set of constructs possible to allow the implementation of the CML compiler's AST in CML itself.

## Branches

Master

![Build Status](https://travis-ci.org/quenio/cml.svg?branch=master)

OO languages mix implementation behavior with the important essence of the domain,
while functional languages describe the domain in a very poor way.
The conceptual model ends up buried behind implementation.
Yet, OO languages provide a key tool for abstraction, which is generalization/specialization,
and functional languages allow the combination of powerful operators (functions) that
enrich the description of the domain.
CML has the expressive power of OO languages to describe the concepts of a domain
and uses functions to derive attributes and associations.
In addition, CML natively represents bidirectional associations,
which are so key in representing some domains.
All this is done without cluttering the conceptual model
with technology noise, while allowing the generation of code
that implements the conceptual model in any technology.
