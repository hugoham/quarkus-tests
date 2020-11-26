package be.district09.sf;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class QuarkusService {

    public QuarkusData getData(long id) {
        QuarkusData data = QuarkusData.findById(id);
        return data;
    }

    public List<QuarkusData> getAllData() {
        return QuarkusData.listAll();
    }
}
