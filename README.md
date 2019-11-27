# ValidCpf - check if a cpf is valid

# Installation

    allprojects {
      repositories {
        google()
        jcenter()
        ...
        maven { url 'https://jitpack.io' }
      }
    }

Build.gradle

    dependencies {
      implementation 'com.github.fill93:ValidCpf:1.0.0'
    }
    
# Usage

Pass a cpf (with or without punctuation) as a parameter in the method

    ValidCPF.isCPFValid("cpf_string")
    
This method returns true if the CPF is valid
    
    
# Example

![](app/src/main/res/drawable/Capturar0.PNG)

