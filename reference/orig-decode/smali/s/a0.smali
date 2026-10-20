.class public final Ls/a0;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# instance fields
.field public final synthetic a:Lt/u1;

.field public final synthetic b:Lc9/c;

.field public final synthetic c:Ly0/o;

.field public final synthetic d:Ls/q0;

.field public final synthetic e:Ls/r0;

.field public final synthetic f:Lc9/e;

.field public final synthetic n:Lc9/f;

.field public final synthetic o:I

.field public final synthetic p:I


# direct methods
.method public constructor <init>(Lt/u1;Lc9/c;Ly0/o;Ls/q0;Ls/r0;Lc9/e;Lc9/f;II)V
    .locals 0

    iput-object p1, p0, Ls/a0;->a:Lt/u1;

    iput-object p2, p0, Ls/a0;->b:Lc9/c;

    iput-object p3, p0, Ls/a0;->c:Ly0/o;

    iput-object p4, p0, Ls/a0;->d:Ls/q0;

    iput-object p5, p0, Ls/a0;->e:Ls/r0;

    iput-object p6, p0, Ls/a0;->f:Lc9/e;

    iput-object p7, p0, Ls/a0;->n:Lc9/f;

    iput p8, p0, Ls/a0;->o:I

    iput p9, p0, Ls/a0;->p:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    move-object v7, p1

    check-cast v7, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    iget-object v0, p0, Ls/a0;->a:Lt/u1;

    iget-object v1, p0, Ls/a0;->b:Lc9/c;

    iget-object v2, p0, Ls/a0;->c:Ly0/o;

    iget-object v3, p0, Ls/a0;->d:Ls/q0;

    iget-object v4, p0, Ls/a0;->e:Ls/r0;

    iget-object v5, p0, Ls/a0;->f:Lc9/e;

    iget-object v6, p0, Ls/a0;->n:Lc9/f;

    iget p1, p0, Ls/a0;->o:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lm0/s;->m(I)I

    move-result v8

    iget v9, p0, Ls/a0;->p:I

    invoke-static/range {v0 .. v9}, Lm9/e0;->a(Lt/u1;Lc9/c;Ly0/o;Ls/q0;Ls/r0;Lc9/e;Lc9/f;Lm0/m;II)V

    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
