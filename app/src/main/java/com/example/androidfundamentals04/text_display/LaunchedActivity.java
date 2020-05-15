package com.example.androidfundamentals04.text_display;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.androidfundamentals04.R;
import com.example.androidfundamentals04.text_display.DisplayActivity;

public class LaunchedActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launched);

        textView = findViewById(R.id.displayedText);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String message = bundle.getString(DisplayActivity.CHOSEN);

            if (message.equals("first")) {
                textView.setText("BoJack F. Horseman is the eponymous character of BoJack Horseman. The show primarily follows BoJack and his life after his successful '90s sitcom, Horsin' Around.\nBoJack is an adult, male, grade/thoroughbred cross horse weighing over 1,200 pounds as revealed in the pilot episode.\n" +
                        "\n" +
                        "He is around 6'7\" feet (15.2 hands at the withers, 19.75 at the ears) tall and he has a fat belly.\n" +
                        "\n" +
                        "He has brown (medium bay) fur and a black mane, with a white snippet on his snout that begins at his upper lip and ends underneath his eyes, a white diamond-shaped mark on his forehead, and bags under his eyes. He also has a pink spot on his nose and pointy ears near his mane.\n" +
                        "\n" +
                        "Despite being a horse, BoJack, like other animals in the BoJack Horseman series, is designed with human feet and hands and does not have a tail.\n" +
                        "\n" +
                        "For the majority of the series, BoJack was typically seen wearing an unbuttoned gray sports jacket with a blue sweater underneath, cyan blue jeans, and red and white sneakers with white socks.\n" +
                        "\n" +
                        "In The Face of Depression, in Season 6 it is revealed that BoJack had been dyeing his hair for around twenty years, and he has it cut by Sharona into a shorter grey style. He also gets a new outfit that consists of an olive green jacket with darker green trim, a light blue button-up shirt, and grey jeans after his old everyday attire gets ruined on a plane ride. He keeps his red and white sneakers from his original attire, and in the winter wears a red and brown striped scarf.\n" +
                        "\n" +
                        "During his twenties-early thirties, he was much slimmer and he had a longer, thicker mane that somewhat resembled a mullet. His fur also appeared lighter in color.\n" +
                        "\n" +
                        "On Horsin' Around, he wore an orange sweater with pink apples along the middle and a pink collar and cuffs, along with light blue jeans and red and white sneakers.\n" +
                        "\n" +
                        "In the 80s, he wore a grey collared shirt with a white plaid design with a white tie, a light blue opened jacket, light blue jeans with a white belt, and red and white sneakers.\n" +
                        "\n" +
                        "As a child, he wore a blue and white sailor suit and had small visible eyelashes and a short mane.\n" +
                        "Screen Shot 2019-03-11 at 8.19.20 PM\n" +
                        "\n" +
                        "Young BoJack in Free Churro\n" +
                        "\n" +
                        "He is seen as a preteen/older child at the beginning of Free Churro. He is wearing a green and white soccer uniform and appears considerably chubby. He has this appearance later in a flashback in A Horse Walks into a Rehab, although he is seen wearing a collared shirt with a dark purple and maroon stripe pattern on the sleeves, a light blue pullover sweater vest, light brown pants, and dark brown does with white socks\n" +
                        "\n" +
                        "In A Horse Walks into a Rehab, he is seen as a teenager sometime around 1980, wearing a dark blue shirt with a yellow stripe and zigzag pattern, brown pants with a light blue belt, and yellow shoes. His hair is longer and a bit messier, slightly starting to resemble the mullet style he would have as an adult, and he had pimples.\n" +
                        "\n" +
                        "In his later teen years, as seen in Thoughts and Prayers and briefly in Time's Arrow, he has a more similar hairstyle/appearance as his young adult self, albeit being shorter and skinnier, and he still has pimples. He was seen wearing a blue, white, and gold football uniform.\n" +
                        "\n" +
                        "In Time's Arrow, he is seen briefly in 1999, at the age of thirty-five, He looks almost exactly how he does in his original appearance, although he does not have any wrinkles and his mane is mostly still thicker. It can be noted that in the Horsin' Around finale BoJack looks how he does normally throughout the series, so this depiction of BoJack could be a result of Beatrice's dementia.\n" +
                        "\n" +
                        "In Season 5, when he is shooting Philbert, he is seen wearing his John Philbert costume for the show more often as the season progresses than his regular attire. He wears a beige trench coat over a grey collared shirt, a dark grey tie, dark grey pants with a black belt with a police badge attached to it, and black shoes. ");
            } else if (message.equals("second")) {
                textView.setText("Princess Carolyn is a female pink Persian cat and one of the main characters throughout the BoJack Horseman series. She is BoJack Horseman's ex-girlfriend and former agent and manager.\n" +
                        "\n" +
                        "Princess Carolyn worked as a talent agent for Vigor before leaving and starting her own agency, VIM, which she eventually had to close, but reopened as a management company.\n" +
                        "\n" +
                        "She served as the producer for Philbert in Season 5 and for Birthday Dad in Season 6.\n" +
                        "\n" +
                        "At the end of Season 5, she adopts a baby porcupine girl, who she eventually names Ruthie in The New Client.\n" +
                        "\n" +
                        "Towards the end of Season 6, she gets an offer from Lenny Turteltaub to start her own production company called Girtletaub however, in Angela it is implied when she is talking to Judah she may have turned down Lenny's offer and started her own production company instead.\n" +
                        "\n" +
                        "Shortly before the finale, she marries Judah Mannowdog. Princess Carolyn is a female Persian cat. She has pink fur, with a curl of pink hair on her head. She has green eyes with bags under them and long black whiskers. According to model sheets, she is only about 4'9\" tall when barefoot and 5'1\" in heels.\n" +
                        "\n" +
                        "She wears a knee-length teal green dress with a yellow fish pattern on it and a grey belt around the waist, a yellow sweater, a gold necklace with a gold pendant with a red dot in the middle, and red high heels.\n" +
                        "\n" +
                        "In 2007, she wore a blue and white striped short-sleeved cropped shirt, a light wash denim mini skirt with a yellow circle belt buckle, a cropped brown button-down jacket, and pink fur-lined Ugg boots with white pom-poms dangling from them, along with a white fedora with a blue and white horizontal striped ribbon on the brim outdoors.\n" +
                        "\n" +
                        "In the mid-late 90s, after she started working for Marv at Vigor in 1993, she had a \"Rachel\" style hairdo—a shoulder-length bob with layers and long, parted bangs that framed her face, and it was a darker shade of pink. She wore a cropped button-up yellow vest over a sleeveless black top, a green skirt with a white and yellow plaid design, and black platform shoes.\n" +
                        "\n" +
                        "As an eighteen-year-old teenager in 1992, she didn't have bags under her eyes, her eyebrows were a little thicker (which may be makeup), and her hair was in a styled back fashion.\n" +
                        "\n" +
                        "She wore a cropped magenta pink sweater, high waist, knee-length, light blue jean shorts with a black belt, white sneakers, and her necklace, which her mother gave to her before she left for California.\n" +
                        "\n" +
                        "In The Amelia Earhart Story, she is briefly seen as a little girl with her hair in curled bangs similar to her mother and wearing a long-sleeved purple shirt. ");
            } else {
                textView.setText("Diane Nguyen is a human Vietnamese-American writer, \"misunderstood intellectual,\" and third-wave feminist from Boston, who lived with her well-off and famous ex-husband, Mr. Peanutbutter, until their divorce in Season 5.\n" +
                        "\n" +
                        "Diane is the only daughter of Pa Nguyen and Ma Nguyen, the younger sister of Tommy, Marty and Artie, and the adoptive younger sister of Gary. \n" +
                        "\n" +
                        "In Season 1 she serves as the ghostwriter for BoJack's memoir, One Trick Pony, which gains massive success and earns BoJack a Golden Globe.\n" +
                        "\n" +
                        "At the end of Season 2 she is hired to be a celebrity Tweet ghostwriter for Princess Carolyn's agency, VIM, and she holds this job until the agency closes in the Season 3 episode It's You.\n" +
                        "\n" +
                        "Two episodes later, in That Went Well, she is hired by Ralph Stilton's sister, Stefani Stilton, as a writer for the website Girl Croosh.\n" +
                        "\n" +
                        "In Season 5, she becomes the consulting producer for the first season of Philbert.\n" +
                        "\n" +
                        "In Season 6, she moves to Chicago to live with her new boyfriend, Guy, leaves Girl Croosh and begins working on a new book, while also beginning to take antidepressants. Her personal book of essays ends up becoming Ivy Tran, a successful middle-grade mystery fiction series.\n" +
                        "\n" +
                        "By the finale, she moves to Houston, Texas to be with Guy, whose ex-wife and son moved there as well, and marries him shortly afterward. Diane is a Vietnamese-American woman and one of the few main characters in BoJack Horseman that is a human. She wears thin, square glasses, and has light skin and midnight blue hair. According to model sheets, she is 5 1/2 feet tall in boots and stands at about 5’3-5’4 when barefoot.\n" +
                        "\n" +
                        "In Seasons 1-5, Diane's hair was long with some of it worn parted over her shoulders.\n" +
                        "\n" +
                        "In Season 5, Diane cuts her hair into a very short bob, with layered bangs that are styled to the left, and an undercut that is partially covered on the right side and appears as a faded purple color.\n" +
                        "\n" +
                        "Her neck is considerably long, a feature that becomes more noticeable after she cuts her hair short.\n" +
                        "\n" +
                        "In Seasons 1-6, Diane wore a green jacket with an orange arrow designed on each end near her abdomen pointing towards her center, a white short-sleeved v-neck undershirt that shows her cleavage and a bit of the bottom of her stomach, blue jeans with a dark grey belt, and black boots that each have two yellow stripes at the top.\n" +
                        "\n" +
                        "In the Season 6 episode The Face of Depression, Diane begins taking antidepressants, which make her gain a significant amount of weight. Her hair has also gotten a bit longer, the bangs on the left side are a little shorter, and the shaved undercut has grown out. She also has a new outfit, consisting of a red and blue jacket with blue arrows pointing towards her abdomen like her previous jacket, a white short-sleeved v-neck shirt similar to the one from her old outfit, although instead, it's longer instead of a crop top, grey jeans, and the same boots from her previous outfit.\n" +
                        "\n" +
                        "In 2007, she had short hair with long parted bangs, a similar style to how she wears in Season 5. When she worked at Starbucks, she wore a blue and white baseball tee under a Starbucks apron with orange arrows pointing to her abdomen, light blue jeans, and a name tag that said \"Blarn.\"\n" +
                        "\n" +
                        "As a sixteen-year-old teenager, from what was seen in her brothers' \"Cry-anne\" video, which was filmed on the night of her homecoming dance, she had pimples, and her hair was puffier (although she may have styled it like this just for the dance), also she had larger glasses with thicker and rounder frames. She wore a purple dress with big ruffled sleeves.\n" +
                        "\n" +
                        "She is seen as a teenager again in a flashback in The Dog Days Are Over. Her hair was straight and went a little past her shoulders, she had thicker eyebrows, thick black glasses with square frames, and pimples. She wore a long-sleeved blue shirt with yellow, red, blue, and white stripes going across the middle, light blue jean shorts, and a black tattoo choker necklace. In this flashback, she was barefoot, although her teen self is depicted similarly in her imagination through crude sketches in Good Damage this time wearing black sneakers and white socks. ");
            }
        }
    }
}
