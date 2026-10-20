.class public final Li3/r;
.super Ljava/lang/Object;

# interfaces
.implements Li3/s;


# instance fields
.field public a:Li3/g0;

.field public final b:Ll2/l;


# direct methods
.method public constructor <init>(Li3/g0;Ll2/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li3/r;->a:Li3/g0;

    iput-object p2, p0, Li3/r;->b:Ll2/l;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Li3/r;->a:Li3/g0;

    return-object v0
.end method

.method public final b(Ljava/lang/CharSequence;IILi3/d0;)Z
    .locals 3

    iget v0, p4, Li3/d0;->c:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x1

    if-lez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Li3/r;->a:Li3/g0;

    if-nez v0, :cond_2

    new-instance v0, Li3/g0;

    instance-of v2, p1, Landroid/text/Spannable;

    if-eqz v2, :cond_1

    check-cast p1, Landroid/text/Spannable;

    goto :goto_0

    :cond_1
    new-instance v2, Landroid/text/SpannableString;

    invoke-direct {v2, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    move-object p1, v2

    :goto_0
    invoke-direct {v0, p1}, Li3/g0;-><init>(Landroid/text/Spannable;)V

    iput-object v0, p0, Li3/r;->a:Li3/g0;

    :cond_2
    iget-object p1, p0, Li3/r;->b:Ll2/l;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Li3/e0;

    invoke-direct {p1, p4}, Li3/e0;-><init>(Li3/d0;)V

    iget-object p4, p0, Li3/r;->a:Li3/g0;

    const/16 v0, 0x21

    invoke-virtual {p4, p1, p2, p3, v0}, Li3/g0;->setSpan(Ljava/lang/Object;III)V

    return v1
.end method
