#Responsibility Model Editor

Contributors

 * Robbie Simpson (robbies),
   University of Glasgow.
   Email: r.simpson.3@research.gla.ac.uk
   
 * Tim Storer (tws),
   University of Glasgow.
   Email: timothy.storer@glasgow.ac.uk

##Installation

##Build From Source

An Ant script is provided for constructing an update site from source. 


    eclipse -noSplash -data . -application org.apache.ant.core.antRunner clean create-plugins


##How to create a new Responsibility Model:

 1. Create a new modelling project
 2. In that project, go to New->Other->Example EMF Model Creation Wizards->ResponsibilityMetaModel 
Model
 3. Click Next.
 4. Select `Scenario' as the Model Object. Finish.
 5. Right click on the project and select `Viewpoints Selection'.
 6. Select `Responsibility Model'
 7. Right click on the project and select `Create Representation'
 8. Select 'Responsibility Diagram'
 9. Select the appropriate model file and Scenario object.
 10. Finish
 11. Name the representation file (default is 'Responsibility Model').


