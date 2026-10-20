.class public final Li4/l;
.super Lw8/c;


# instance fields
.field public a:Li4/o;

.field public b:Ls4/p;

.field public c:Ls4/j;

.field public d:Li4/e;

.field public e:Landroid/graphics/Bitmap;

.field public synthetic f:Ljava/lang/Object;

.field public final synthetic n:Li4/o;

.field public o:I


# direct methods
.method public constructor <init>(Li4/o;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Li4/l;->n:Li4/o;

    invoke-direct {p0, p2}, Lw8/c;-><init>(Lu8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Li4/l;->f:Ljava/lang/Object;

    iget p1, p0, Li4/l;->o:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Li4/l;->o:I

    const/4 p1, 0x0

    const/4 v0, 0x0

    iget-object v1, p0, Li4/l;->n:Li4/o;

    invoke-static {v1, p1, v0, p0}, Li4/o;->a(Li4/o;Ls4/j;ILu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
