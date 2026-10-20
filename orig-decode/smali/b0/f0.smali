.class public final Lb0/f0;
.super Lw8/c;


# instance fields
.field public a:Lb0/h0;

.field public b:Lu/s1;

.field public c:Lc9/e;

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lb0/h0;

.field public f:I


# direct methods
.method public constructor <init>(Lb0/h0;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lb0/f0;->e:Lb0/h0;

    invoke-direct {p0, p2}, Lw8/c;-><init>(Lu8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lb0/f0;->d:Ljava/lang/Object;

    iget p1, p0, Lb0/f0;->f:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lb0/f0;->f:I

    iget-object p1, p0, Lb0/f0;->e:Lb0/h0;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lb0/h0;->r(Lb0/h0;Lu/s1;Lc9/e;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
