package cml.language.interfaces.tree;

import cml.language.features.model.ModelNode;
import cml.language.foundation.elements.SourceLocation;

public interface SyntaxTreeBuilder
{
    void startBuilding();
    ModelNode finishingBuilding();

    @BeforeRule("model")
    void createModelNode(SourceLocation location);

    @BeforeRule("modelElement")
    void createModelElementNode(SourceLocation location);

    @AfterRule("modelElement")
    void includeModelElementNode(SourceLocation location);

    @AfterRule("concept")
    void includeConceptNode(SourceLocation location, String name);

    @AfterRule("target")
    void includeTargetNode(SourceLocation location, String name);

    @BeforeRule("propertyList")
    void createPropertyList(SourceLocation location);

    @AfterRule("property")
    void includeProperty(SourceLocation location, String name, String string);

    @AfterRule("type")
    void includeType(SourceLocation location, String name);
}
