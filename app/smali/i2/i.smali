.class public final Li2/i;
.super Ljava/lang/Object;


# static fields
.field public static final a:Li2/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li2/g;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Li3/l;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Li2/g;->a()Lm0/l3;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iput-object v1, v0, Li2/g;->a:Lm0/l3;

    sput-object v0, Li2/i;->a:Li2/g;

    return-void
.end method
