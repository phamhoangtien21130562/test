package chapter2.agent_ABCD;

import chapter2.agent_ABCD.Environment.LocationState;

public class AgentProgram {

	public Action execute(Percept p) {// location, status
		// TODO
		if (p.getLocationState() == LocationState.DIRTY) {
			return Environment.SUCK_DIRT;

		} else if (p.getAgentLocation() == Environment.LOCATION_A) {
			return Environment.MOVE_RIGHT;
		} else if (p.getAgentLocation() == Environment.LOCATION_B) {
			return Environment.MOVE_BOTTOM;
		} else if (p.getAgentLocation() == Environment.LOCATION_C) {
			return Environment.MOVE_LEFT;
		 
		}else {
			return Environment.MOVE_TOP;
		} 
		
//		return NoOpAction.NO_OP;
		
	}
}