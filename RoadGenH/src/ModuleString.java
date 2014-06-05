import java.util.ArrayList;
import java.util.List;


public class ModuleString {
	
	List<Module> modules;

	public ModuleString() {
		modules = new ArrayList<Module>();
	}

	public int length() {
		return modules.size();
	}
	
	public void addModule(Module module) {
		modules.add(module);
	}
	
	public Module getFstModule() {
		if(!modules.isEmpty()) {
			return modules.get(0);
		}
		return null;
	}
	
	public Module getLastModule() {
		if(!modules.isEmpty()) {
			return modules.get(modules.size() - 1);
		}
		return null;
	}
}
