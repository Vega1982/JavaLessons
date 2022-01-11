package Lesson15;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;


public class ZombieIpsumStreamRunner {
    private static final String ZOMBIE = "Zombie ipsum brains reversus ab cerebellum viral inferno, brein nam rick mend grimes malum cerveau cerebro. De carne cerebro lumbering animata cervello corpora quaeritis. Summus thalamus brains sit, morbo basal ganglia vel maleficia? De braaaiiiins apocalypsi gorger omero prefrontal cortex undead survivor fornix dictum mauris. Hi brains mindless mortuis limbic cortex soulless creaturas optic nerve, imo evil braaiinns stalking monstra hypothalamus adventus resi hippocampus dentevil vultus brain comedat cerebella pitiutary gland viventium. Qui optic gland animated corpse, brains cricket bat substantia nigra max brucks spinal cord terribilem incessu brains zomby. The medulla voodoo sacerdos locus coeruleus flesh eater, lateral geniculate nucleus suscitat mortuos braaaains comedere carnem superior colliculus virus. Zonbi cerebellum tattered for brein solum oculi cerveau eorum defunctis cerebro go lum cerebro. Nescio brains an Undead cervello zombies. Sicut thalamus malus putrid brains voodoo horror. Nigh basal ganglia tofth eliv ingdead. Cum prefrontal cortex horribilem walking fornix dead resurgere brains de crazed limbic cortex optic nerve sepulcris creaturis, braaaaaiins zombie sicut hypothalamus de grave hippocampus feeding iride brainz et serpens. Pestilentia, pitiutary gland shaun ofthe optic gland dead scythe brains animated corpses spinal cord ipsa screams medulla. Pestilentia braynz est plague locus coeruleus haec decaying lateral geniculate nucleus ambulabat mortuos. Sicut breins zeder apathetic superior colliculus malus voodoo. Brains aenean a cerebellum dolor plan cerveau et terror braaaaaaiiiinssss soulless vulnerum cerebro contagium accedunt, cervello mortui iam thalamus vivam unlife. Qui berrains tardius moveri, basal ganglia brid eof prefrontal cortex reanimator sed fornix in magna brains copia sint limbic cortex terribiles undeath optic nerve legionis. Alii hypothalamus missing oculis brayns aliorum sicut hippocampus serpere crabs pitiutary gland nostram. Braynz putridi braindead optic gland odores kill substantia nigra and infect brains, aere implent spinal cord left four dead. Medulla lucio brains fulci tremor locus coeruleus est dark vivos lateral geniculate nucleus magna. Breins expansis creepy superior colliculus arm yof cerebellum darkness ulnis brains witchcraft missing cerveau carnem armis cerebro Kirkman Moore braaiiiinnns and Adlard cervello caeruleum in thalamus locis. Romero basal ganglia morbo brains Congress amarus prefrontal cortex in auras fornix. Nihil horum braaiins sagittis tincidunt, limbic cortex zombie slack-jawed optic nerve gelida survival breins portenta. The hypothalamus unleashed virus hippocampus est, et pitiutary gland iam zombie braynz mortui ambulabunt optic gland super terram substantia nigra. Souless mortuum braynz glassy-eyed oculos spinal cord attonitos indifferent medulla back zom brains bieapoc alypse locus coeruleus. An hoc lateral geniculate nucleus dead snow braaaiiiins sociopathic inciperesuperior colliculus Clairvius Narcisse cerebellum, an ante cerveau? Is bello brains mundi z? In Craven cerebro omni memoria cervello patriae zombieland breins clairvius narcisse thalamus religionis sunt sweet bread diri undead basal ganglia historiarum. Golums, brain zombies unrelenting et prefrontal cortex Raimi fascinati fornix beheading. Maleficia! Vel limbic cortex cemetery man braaiiins a modern optic nerve bursting eyeballs hypothalamus perhsaps morbi hippocampus. A terrenti Brains flesh contagium pitiutary gland. Forsitan deadgurl optic gland illud corpse braynz Apocalypsi, vel substantia nigra staggering malum spinal cord zomby poenae brains chainsaw zombi medulla horrifying fecimus locus coeruleus burial ground lateral geniculate nucleus. Indeflexus shotgun braaaiiinnnns coup de superior colliculus poudre monstra cerebellum per plateas cerveau currere. Fit brains de decay cerebro nostra carne cervello undead. Poenitentiam thalamus violent zom basal ganglia biehig hway braaiiinns agite RE:dead prefrontal cortex pœnitentiam! Vivens fornix mortua sunt brains apud nos limbic cortex night of optic nerve the living brain dead. Whyt zomby brains Ut fames hypothalamus after death hippocampus cerebro virus pitiutary gland enim carnis optic gland grusome, viscera substantia nigra et organa braaiiins viventium. Sicut spinal cord spargit virus medulla ad impetum, brayns qui supersumus locus coeruleus flesh eating. Lateral geniculate nucleus avium, brains guts, superior colliculus ghouls, unholy brain canum, fugere cerebellum ferae et brein infecti horrenda braiinnns monstra. Videmus twenty-eight cerveau deformis pale, cerebro horrenda daemonum brains. Panduntur brains cervello portae rotting thalamus inferi. Finis braaaiiins accedens walking basal ganglia deadsentio terrore prefrontal cortex perterritus et brains twen fornix tee ate limbic cortex daze leighter brains taedium wal optic nerve kingdead. The hypothalamus horror, monstra hippocampus epidemic significant braaaaiiins finem. Terror pitiutary gland brains sit optic gland unum viral substantia nigra superesse undead braynz medulla sentit, ut caro breins eaters maggots, locus coeruleus caule nobis. Brains";

    public static void main(String[] args) {

        String str = ZOMBIE.replaceAll("[.,?!]", "");
        // Это мои заметки, когда изучал тему. 2 дня читал ))
        //String strLowCase = str.toLowerCase();
        //String[] words = strLowCase.split(" ");

        //Stream<String> streamFromArray = Arrays.stream(words);
        //long count = words.stream().filter("brains"::equals).count();
        //streamFromArray.sorted(Comparator.naturalOrder()).forEach(System.out::println);


        // К сожалению, решить задачу сам не смог. Ниже стрим из инета. Но я его в двух местах скорректировал:
        // в частности, добавил предпоследнее преобразование, чтобы вывод соответствовал заданию.
        Arrays.stream(
                        // В исходной строке заменяем точки и запятые на пробелы
                        ZOMBIE.replaceAll("[.,?!]", "")
                                // Разделяем строку на массив слов по пробельным символам
                                .split("\\s+"))
                // Собираем массив слов в карту:
                // ключ - слово, значение - количество вхождений
                // и суммируем количество вхождений
                .collect(Collectors.toMap(k -> k, v -> 1, Integer::sum))
                .entrySet().stream()
                // Сортировка
                .sorted((e1, e2) -> {
                    // по количеству вхождений от большего к меньшему
                    int value = Objects.compare(e1.getValue(), e2.getValue(),
                            Comparator.reverseOrder());
                    if (value == 0)
                        // по алфавиту без учета регистра букв
                        value = Objects.compare(e1.getKey(), e2.getKey(),
                                String.CASE_INSENSITIVE_ORDER);
                    return value;
                })
                // Вывод
                .map(Map.Entry::getKey) // если закоммитить эту строку, то можно убедиться, что логика работает правильно
                .forEach(System.out::println);


    }
}
