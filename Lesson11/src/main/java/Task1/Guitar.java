package Task1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Guitar implements IInstrument {
    private int string;

    @Override
    public void play() {
        System.out.println("Играет гитара с количеством струн: " + getString());
    }
}
