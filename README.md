# java-ac4y-tlmi-command

TLMI command domain with test command implementation and algebra layer.

## Coordinates

- **GroupId**: `ac4y`
- **ArtifactId**: `ac4y-tlmi-command`
- **Version**: `1.0.0`

## Description

Command domain for TLMI providing a test command implementation extending the ac4y command framework. Contains algebra base class and concrete command class.

### Key Classes

- `Test` - TLMI test command extending Ac4yCommand
- `TestAlgebra` - Algebra base class

## Dependencies

- `ac4y-command` (Ac4yCommand framework)
- `ac4y-base4jsonandxml` (JSON/XML serialization)

## Build

```bash
mvn clean package
```

## Origin

Extracted from `IJTlmiModule/TlmiCommand`.
