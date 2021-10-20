using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Lab06_RemoteControl
{
    public partial class RemoteControl : Form
    {
        private ICommand Slot1ON;
        private ICommand Slot1OFF;
        private ICommand Slot2ON;
        private ICommand Slot2OFF;

        //Light
        private Light light;
        private ICommand LightON;
        private ICommand LightOFF;

        //TV
        private TV tv;
        private ICommand TVON;
        private ICommand TVOFF;


        public RemoteControl()
        {
            InitializeComponent();

            //Light
            light = new Light(this.txtStatus1);
            LightON = new LightOn(light);
            LightOFF = new LightOff(light);

            //TV
            tv = new TV(this.btnTV);
            TVON = new TVOn(tv);
            TVOFF = new TVOff(tv);
        }

        private void btnOn1_Click(object sender, EventArgs e)
        {
            Slot1ON.Execute();        
        }

        private void btnOFF1_Click(object sender, EventArgs e)
        {
            Slot1OFF.Execute();
        }

        private void cboSlot1_SelectedIndexChanged(object sender, EventArgs e)
        {
            String option = cboSlot1.SelectedItem.ToString();
            choiceDevice(option, 1);
        }

        private void btnON2_Click(object sender, EventArgs e)
        {
            this.Slot2ON.Execute();
        }

        private void btnOFF2_Click(object sender, EventArgs e)
        {
            this.Slot2OFF.Execute();
        }

        private void cboSlot2_SelectedIndexChanged(object sender, EventArgs e)
        {
            String option = cboSlot2.SelectedItem.ToString();

            choiceDevice(option, 2);
        }

        private void assignCommandOnOFF(String option,  ref ICommand On, ref ICommand Off)
        {
            if (option.Equals("Light"))
            {
                Off = LightOFF;
                On = LightON;
            }
            else if (option.Equals("TV"))
            {
                Off = TVOFF;
                On = TVON;
            }
            //...
        }
        private void choiceDevice(String option, int slotNum)
        {
            if (slotNum == 1)
            {
                assignCommandOnOFF(option, ref Slot1ON, ref Slot1OFF);
            }
            else if(slotNum == 2)
            {
                assignCommandOnOFF(option, ref Slot2ON,  ref Slot2OFF);
            }

        }
    }
}
