# Architektura - java-ac4y-tlmi-command

## Attekintes

TLMI parancs domain teszt parancs implementacioval es algebra reteggel.

## Szerkezet

```
src/main/java/tlmi/command/
  algebra/
    TestAlgebra.java                    - Teszt parancs algebra bazis
  domain/
    Test.java                           - TLMI teszt parancs (Ac4yCommand kiterjesztese)
```

## Fuggosegek

- ac4y-command (Ac4yCommand keretrendszer)
- ac4y-base4jsonandxml (JSON/XML szerializacio)

## Eredet

Az `IJTlmiModule/TlmiCommand` modulbol kinyerve.
