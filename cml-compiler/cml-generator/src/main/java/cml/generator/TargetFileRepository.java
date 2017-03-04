package cml.generator;

import cml.language.features.target.Target;

import java.util.Map;
import java.util.Set;

interface TargetFileRepository
{
    Set<TargetFile> findTargetFiles(Target target, String fileType, Map<String, Object> args);
}
