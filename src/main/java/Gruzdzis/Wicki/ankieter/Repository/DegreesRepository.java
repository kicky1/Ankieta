package Gruzdzis.Wicki.ankieter.Repository;

import Gruzdzis.Wicki.ankieter.Model.Degrees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DegreesRepository extends JpaRepository<Degrees, Long >
{

}
