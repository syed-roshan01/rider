.class public final Ly0/a;
.super Ljava/lang/Object;

# interfaces
.implements Lu8/i;


# static fields
.field public static final a:Ly0/g;

.field public static final b:Ly0/g;

.field public static final c:Ly0/g;

.field public static final d:Ly0/g;

.field public static final e:Ly0/g;

.field public static final f:Ly0/f;

.field public static final n:Ly0/f;

.field public static final o:Ly0/e;

.field public static final p:Ly0/e;

.field public static final q:Ly0/e;

.field public static final synthetic r:Ly0/a;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 4

    new-instance v0, Ly0/g;

    const/high16 v1, -0x40800000    # -1.0f

    invoke-direct {v0, v1, v1}, Ly0/g;-><init>(FF)V

    sput-object v0, Ly0/a;->a:Ly0/g;

    new-instance v0, Ly0/g;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ly0/g;-><init>(FF)V

    sput-object v0, Ly0/a;->b:Ly0/g;

    new-instance v0, Ly0/g;

    invoke-direct {v0, v2, v2}, Ly0/g;-><init>(FF)V

    sput-object v0, Ly0/a;->c:Ly0/g;

    new-instance v0, Ly0/g;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v3}, Ly0/g;-><init>(FF)V

    sput-object v0, Ly0/a;->d:Ly0/g;

    new-instance v0, Ly0/g;

    invoke-direct {v0, v2, v3}, Ly0/g;-><init>(FF)V

    sput-object v0, Ly0/a;->e:Ly0/g;

    new-instance v0, Ly0/f;

    invoke-direct {v0, v1}, Ly0/f;-><init>(F)V

    sput-object v0, Ly0/a;->f:Ly0/f;

    new-instance v0, Ly0/f;

    invoke-direct {v0, v2}, Ly0/f;-><init>(F)V

    sput-object v0, Ly0/a;->n:Ly0/f;

    new-instance v0, Ly0/e;

    invoke-direct {v0, v1}, Ly0/e;-><init>(F)V

    sput-object v0, Ly0/a;->o:Ly0/e;

    new-instance v0, Ly0/e;

    invoke-direct {v0, v2}, Ly0/e;-><init>(F)V

    sput-object v0, Ly0/a;->p:Ly0/e;

    new-instance v0, Ly0/e;

    invoke-direct {v0, v3}, Ly0/e;-><init>(F)V

    sput-object v0, Ly0/a;->q:Ly0/e;

    new-instance v0, Ly0/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ly0/a;->r:Ly0/a;

    return-void
.end method
