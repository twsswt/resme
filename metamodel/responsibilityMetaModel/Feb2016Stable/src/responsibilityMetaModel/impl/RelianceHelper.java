package responsibilityMetaModel.impl;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import responsibilityMetaModel.Actor;
import responsibilityMetaModel.Entity;

public class RelianceHelper {
	
	public EList<Entity> traversed;
	public EList<Actor> depends;
	
	RelianceHelper(){
		traversed = new BasicEList<Entity>();
		depends = new BasicEList<Actor>();
	}

	public RelianceHelper(EList<Entity> traversed, EList<Actor> depends) {
		this.traversed = traversed;
		this.depends = depends;
	}
	

}
