package gameUserManagement.Concrete;

import gameUserManagement.Abstract.UserCheckService;
import gameUserManagement.Entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class UserCheckManager implements UserCheckService {

	@Override
	public boolean checkIfRealPerson(User user) {
		try {KPSPublicSoap mernisValidation = new KPSPublicSoapProxy();
		return mernisValidation.TCKimlikNoDogrula(user.getNationalityId(), user.getFirstName().toUpperCase(), user.getLastName().toUpperCase(), user.getDateYear());
		}
		catch (Exception e) {
			return false;
		}
	}

}
