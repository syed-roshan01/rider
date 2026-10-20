.class public final Lk6/j;
.super La6/a;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lk6/j;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Landroid/os/Bundle;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lz5/n;

    sget v1, Ld9/ۥۡۧۡ;->۟ۡۨ:I

    xor-int/lit16 v1, v1, 0x354

    invoke-direct {v0, v1}, Lz5/n;-><init>(I)V

    sput-object v0, Lk6/j;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Bundle;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk6/j;->a:Landroid/os/Bundle;

    invoke-static {}, Lk3/ۦ۠ۢۥ;->۟ۤۡۢ۠()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "kd8qleVmmLVe6J"

    invoke-static {v0}, Landroidx/compose/ui/graphics/ۣۤۧۢ;->ۣۡ۟ۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 5

    const/4 v3, 0x0

    const/4 v0, 0x0

    const-string v1, "\u06e8\u06e5\u06e4"

    move v2, v3

    move v4, v3

    :goto_0
    invoke-static {v1}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {v4, p1}, Li5/ۢۤۡ;->۟ۡ۟ۤ۟(ILjava/lang/Object;)V

    const-string v1, "\u06e1\u06e1\u06e2"

    goto :goto_0

    :sswitch_0
    const/4 v1, 0x1

    invoke-static {p1, v1, v0}, Lc1/ۢۥۥ۟;->ۣ۠ۥۧ(Ljava/lang/Object;ILjava/lang/Object;)V

    const-string v1, "\u06e0\u06df\u06e8"

    goto :goto_0

    :sswitch_1
    invoke-static {v2, p1}, Lcom/google/android/gms/common/ۦۢۨ;->ۣ۟ۧۡۤ(ILjava/lang/Object;)I

    move-result v3

    const-string v1, "\u06e0\u06e3\u06e7"

    move v4, v3

    goto :goto_0

    :sswitch_2
    xor-int/lit16 v2, v4, -0x4c63

    const-string v1, "\u06e4\u06e8\u06e0"

    goto :goto_0

    :sswitch_3
    sget v3, Lc6/۟ۧۧ۠ۤ;->۟ۧ۟ۧۥ:I

    const-string v1, "\u06e6\u06e6\u06e2"

    move v4, v3

    goto :goto_0

    :sswitch_4
    invoke-static {p0}, Landroidx/compose/ui/platform/۟ۨۨۨ;->۟ۥۣۣۨ(Ljava/lang/Object;)Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "\u06e7\u06e8\u06df"

    goto :goto_0

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aab44 -> :sswitch_4
        0x1aaec2 -> :sswitch_5
        0x1abadc -> :sswitch_1
        0x1ac222 -> :sswitch_2
        0x1ac61e -> :sswitch_0
        0x1ac987 -> :sswitch_3
    .end sparse-switch
.end method
