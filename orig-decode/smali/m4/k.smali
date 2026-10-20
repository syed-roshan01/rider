.class public final Lm4/k;
.super Lw8/c;


# instance fields
.field public a:Lm4/l;

.field public b:Ll4/m;

.field public c:Ljava/lang/Object;

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lm4/l;

.field public f:I


# direct methods
.method public constructor <init>(Lm4/l;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lm4/k;->e:Lm4/l;

    invoke-direct {p0, p2}, Lw8/c;-><init>(Lu8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lm4/k;->d:Ljava/lang/Object;

    iget p1, p0, Lm4/k;->f:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lm4/k;->f:I

    iget-object p1, p0, Lm4/k;->e:Lm4/l;

    invoke-virtual {p1, p0}, Lm4/l;->a(Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
