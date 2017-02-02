package cml.generator;

import java.io.InputStream;

class PlainTemplateDirectory implements TemplateDirectory
{
    private static final String GROUP_EXT = ".stg";

    @Override
    public boolean includesTemplateGroup(final String targetType, final String groupName)
    {
        final String resourcePath = "/" + targetType + "/" + groupName + GROUP_EXT;
        final InputStream stream = getClass().getResourceAsStream(resourcePath);
        return stream != null;
    }
}
