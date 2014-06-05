
public class RoadGenerator {

	public RoadGenerator() {
		
	}

	public void generateRoad(int[][] heightMap, int[][] populationDensityMap) {
		
		if(heightMap.length != populationDensityMap.length || heightMap[0].length != populationDensityMap[0].length) {
			return;
		}
			
		ModuleString modules = new ModuleString();
		Module fstModule = findFstModule(populationDensityMap);
		
		if(fstModule != null) {
			modules.addModule(fstModule);
			
			// While roads are not finished...
			// 1. Return the ideal successor by the L-system (module parameters, unassigned).
			// 2. Call globalGoals() (module parameters, assigned).
			// 3. Call localConstraints() (module parameters, adjusted).  
			while(true) {
				LSystem(modules);
				globalGoals(modules);
				localConstraints(modules);
			}
		}
	}
	
	public ModuleString LSystem(ModuleString modules) {
		// TODO
		return null;
	}
	
	/**
	 * Set the initial module parameter values according to global goals.
	 * 1. Connect dense population zones.
	 * (2. Follow street patterns.)
	 * @return
	 */
	public ModuleString globalGoals(ModuleString modules) {
		// TODO
		return null;
	}
	
	/**
	 * Adjust the module parameters according to local constraints.
	 * 1. Geographical constraints such as land/water boundaries and street crossings.
	 * 2. Snap to nearby road.
	 * 3. Check for street crossings.
	 * @return
	 */
	public ModuleString localConstraints(ModuleString modules) {
		// TODO
		return null;
		
	}
	
	public Module findFstModule(int[][] populationDensityMap) {
		for(int i = 0; i < populationDensityMap.length; i++) {
			for(int j = 0; j < populationDensityMap[i].length; j++) {
				if(populationDensityMap[i][j] > 0) {
					Module module = new Module();
					module.setType(Module.TYPE.R);
					return module; 
				}
			}
		}
		return null;
	}
}
