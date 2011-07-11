# gwt-titanium

Implementation of Titanium Mobile SDK 1.7.0 in GWT.

[Homepage](http://www.iPhoneJava.org/ "The iPhoneJava Project Homepage")

### Features

 - Custom linker to limit GWT bloat
 - Generated code runs directly under the Titanium Mobile SDK
 - Wrappers to the entire Titanium Mobile API
 - Utility classes to perform common tasks (os version detection, etc).
 
### Still Missing
 - Usage Examples 
 
### Limitations

 - Most of the API is still untested
 - No direct Java debugging

## Building gwt-titanium

In order to build gwt-titanium, first copy gwt-dev.jar and gwt-user.jar from the GWT distribution into the lib directory.  
then run ant build in the main directory. This will build the GWT module as a jar file named gwt-titanium.jar in the build/ folder.

