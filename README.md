##Responsibility Model Editor

Contributors

  * Robbie Simpson (rsimpson/robmods)
    University of Glasgow
    Email: r.simpson.3@research.gla.ac.uk
   
  * Tim Storer (twsswt/tws)
    University of Glasgow.
    Email: timothy.storer@glasgow.ac.uk

##Installing the Plugin in Eclipse or Obeo

An update site for the Responsibility Model Editor is available at:

    http://www.dcs.gla.ac.uk/~tws/software/resme-update-site/

For ease of installation, first install Eclipse Sirius via the Eclipse Marketplace.
    
In your IDE, choose Help -> Install New Software and click Add... to add a new update site.  Enter a name for the site (e.g. Responsibility Model Editor) and the URL above. Unselect `Group items by 
category' to show the Responsibility Model Editor.

Now follow the instructions in the wizard for installing the Responsibility Model Editor feature from the site.

##Building the Update Site from Source

An Ant script is provided for constructing an update site from source.  This 
needs to be executed from within Eclipse, since it depends on a number of 
custom Eclipse tasks.  To do this, execute the following command line arguments:

    %>cd <resme>/update-site
    %>eclipse -noSplash -data . -application org.eclipse.ant.core.antRunner clean create-plugins

This will create an update site in <pre><resme>/update-site/target/update-site</pre>.  This can then be opened in an Eclipse project to install the Responsibility Model Editor features.

##Creating a new Responsibility Model:

  1. Switch to the "Sirius" Perspective (Window -> Open Perspective -> Other - > Sirius)
  2. Create a new Modelling Project (File -> New -> Modelling Project or File -> New -> Other and choose Modelling Project).
  3. In that project, go to New-> Other -> Example EMF Model Creation Wizards -> ResponsibilityMetaModel Model/
  4. Click Next.
  5. Select "Scenario" as the Model Object. Finish.  This should create a responsibilitymodel file.
  6. Right click on the project and select "Viewpoints Selection".
  7. Select "Responsibility Model"
  8. Right click on the project and select "Create Representation"
  9. Select "Responsibility Diagram"
  10. Select the appropriate model file and Scenario object.
  11. Finish
  12. Name the representation file (default is "Responsibility Model").


##Importing an existing Responsibility Model:

A Responsibility Model comprises two files: a metamodel description
<code>.responsibilitymetamodel</code> file and a <code>.aird</code>
representation file.  These should be appear in the root directory of an Eclipse
project, but can be retrieved in a variety of ways in Eclipse.  We recommend
storing model files in a version control system, such as Subversion or Git,
which are fully supported by the Eclipse framework.

For example, to import the TCAS Case Study  model from GitHub:

1. Choose "File->Import..." from the Eclipse Menu Bar to open the Import dialogue.
2. Choose "Git->Projects from Git" and click "Next".
3. Choose "Clone URI" and click "Next".
4. Enter the URI of the repository,
   https://github.com/twsswt/resme-tcas-case-study in the Location URI dialogue
   box and click "Next".
5. Choose the "master" branch and click "Next".
6. Modify the local destination if desired (default is ~user/git/resme-tcas-case-study) and click "Next".
7. Choose "Import as a general project" and click "Next".
8. Enter the project name, default is "resme-tcas-case-study" and click "Finish".
9. Clicking on the representations.aird file will open the model diagram.

##Procedure for updating Version Numbers

1. Update Version numbers defined in three seperate locations across the project eco-system:

  * update-site/site.xml (deprecated) and update-site/category.xml so that features are properly categorised.
  * feature/feature.xml, for the feature itself and the bundle of projects that constitute the feature.
  * feature/build.xml, for the file name for the feature.
  * the individual manifests (MANIFEST.MF) of the sub-projects for each of the bundles.

2. Commit the project to trunk.

3. Create an SVN tag "release-&lt;VERSION&gt;".  To do this in a working copy type:

    svn copy ^/trunk ^/tags/release-<VERSION>
